function uploadImage() {
    var file = $('#img')[0].files[0];
    var formData = new FormData();
    formData.append('data', file);

    $.ajax({
        type: 'POST',
        url: '/upload/image',
        data: formData,
        processData: false,
        contentType: false
    }).done(function (data) {
        $('#result-image').attr("src", data);
    }).fail(function (error) {
        alert(error);
    })
}

function uploadImageDog() {
    var file = $('#imageinput')[0].files[0];
    var formData = new FormData();
    formData.append('data', file);

    $.ajax({
        type: 'POST',
        url: '/upload/image/dog',
        data: formData,
        processData: false,
        contentType: false
    }).done(function (data) {
        $('#result-image').attr("src", data);
    }).fail(function (error) {
        alert(error);
    })
}