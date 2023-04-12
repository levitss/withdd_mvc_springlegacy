<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="login.css" />
    <script src="login.js"></script>
    <title>Login</title>
    

</head>

<body>
    <div class="container">
        <div class="orangeBg">
            <div class="box signin">
                <h2>이미 계정이 있습니다.</h2>
                <button class="signinbtn">로그인</button>
            </div>
            <div class="box signup">
                <h2>Create An Account</h2>
                <button class="signupbtn">회원가입</button>
            </div>
        </div>
        <div class="form-box">
            <div class="form signinform">
                <form>
                    <h3>로그인</h3>
                    <input type="text" placeholder="Email">
                    <input type="password" placeholder="Password">
                    <input type="submit" value="Login">
                    <a href="#">forget password?</a>
                </form>
            </div>
            <div class="form signupform">
                <form action="/join" method="post">
                    <h3>회원가입</h3>
                    <input type="text" placeholder="이름">
                    <input type="email" placeholder="Email">
                    <input type="password" placeholder="Password">
                    <input type="password" placeholder="Confirm Password">
                    <input type="submit" value="가입하기">
                </form>
            </div>
        </div>
    </div>
    <div class="return-main"><a href="main.html">메인화면으로 돌아가기</a></div>
    <script>
        const signin = document.querySelector(".signinbtn");
        const signup = document.querySelector(".signupbtn");
        const formbox = document.querySelector(".form-box");
        const body = document.querySelector("body");
        signup.onclick = function(){
            formbox.classList.add("active")
            body.classList.add("active")
        }
        signin.onclick = function(){
            formbox.classList.remove("active")
            body.classList.remove("active")
        }
    </script>
    
    
</body>

</html>