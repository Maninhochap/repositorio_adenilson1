navigator.mediaDevices.getUserMedia({video: true}).then(function(mediaStream) {
    const video = document.querySelector("#video");
    video.srcObject = mediaStream;
    video.play();
})
document.getElementById("capture").addEventListener("click", function(e){
    var canvas = document.getElementById("canvas");
    canvas.width  = video.videoWidth;
    canvas.height = video.videoHeight;
    var context = canvas.getContext("2d");
    context.drawImage(video, 0, 0);
})