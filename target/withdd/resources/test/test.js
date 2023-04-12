

document.write('<script type="text/javascript" src="https://jsonip.com"></script>');

// require('dotenv').config();

// const axios = require('axios');
// const CryptoJS = require("crypto-js");

const access_key = 'IRK2Xe51EpaySvvZl7lH'; //발급받은 api Key 입력
const secret_key = '4YZiCBrbz4o5zxltH2Ffd33ga1qLTSFO85XpqMc1';  //발급받은 Secret_key 입력

const requestMethod = "GET";
const hostName = 'https://geolocation.apigw.ntruss.com'
const requestUrl= '/geolocation/v2/geoLocation'
const list ={
  a:"aaaa"
};
const timeStamp = Math.floor(+new Date).toString();

  async function map(){
  const sortedSet = {};
  sortedSet["ip"] = ip; //예시ip 
  sortedSet["ext"] = "t";
  sortedSet["responseFormatType"] = "json";

  let queryString = Object.keys(sortedSet).reduce( (prev, curr)=>{
    return prev + curr + '=' + sortedSet[curr] + '&';
  }, "");

  queryString = queryString.substr(0, queryString.length -1 );

  const baseString = requestUrl + "?" + queryString;
  const signature = makeSignature(secret_key, requestMethod, baseString, timeStamp, access_key);

  const config = {
    headers: {
      'x-ncp-apigw-timestamp': timeStamp,
      'x-ncp-iam-access-key' : access_key,
      'x-ncp-apigw-signature-v2': signature
    }
  }
    console.log(list);
    let a = await axios.get(`${hostName}${baseString}`, config) //내가 밖으로 내보내고 싶은값
    list.b = a.data;
    return a ;
  };

  map();

// console.log("asdkjlasdlasd",list)

// function makeSignature(secretKey, method, baseString, timestamp, accessKey) {
//     const space = " ";
//     const newLine = "\n";
//     let hmac = CryptoJS.algo.HMAC.create(CryptoJS.algo.SHA256, secretKey);

//     hmac.update(method);
//     hmac.update(space);
//     hmac.update(baseString);
//     hmac.update(newLine);
//     hmac.update(timestamp);
//     hmac.update(newLine);
//     hmac.update(accessKey);
//     const hash = hmac.finalize();

//     return hash.toString(CryptoJS.enc.Base64);
// }








// var container = document.getElementById('map');
// var options = {
//     center: new kakao.maps.LatLng(33.450701, 126.570667),//기본 좌표
//     level: 3//확대 레벨
// };


// var map = new kakao.maps.Map(container, options);//지도 생성


// var mapTypeControl = new kakao.maps.MapTypeControl(); //컨트롤러 생성
// map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT);
// var zoomControl = new kakao.maps.ZoomControl();
// map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
// var locnow=new kakao.maps.
// function locationLoadSuccess(pos){
//     //현재위치 받아오기
//     var currentPos=new kakao.maps.LatLng(pos.coords.latitude, pos.coords.longitude);
//     map.panTo(currentPos);
//     var marker =new kakao.maps.Marker({
//         position: currentPos
//     });
//     marker.setMap(null);
//     marker.setMap(map);
// }
// function locationLoadError(pos){
//     alert('위치 정보를 가져오는데 실패했습니다.');
// };

// // 위치 가져오기 버튼 클릭시
// function getCurrentPosBtn(){
//     navigator.geolocation.getCurrentPosition(locationLoadSuccess,locationLoadError);
// };
