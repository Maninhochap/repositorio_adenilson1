const api = {
    //key: "64ed82577ced7f69cb1687f0ce536131",
     key: "6e2f966857d6fcace1d7be48ede3d56d",
     base: "https://api.openweathermap.org/data/2.5/",
     lang: "pt_br",
     units: "metric"
}
const city           = document.querySelector(".city");
const data           = document.querySelector(".data");
const container_img  = document.querySelector(".container-img");
const container_temp = document.querySelector(".container-temp");
const temp_number    = document.querySelector(".container-temp div");
const temp_unit      = document.querySelector(".container-temp span");
const weather_t      = document.querySelector(".weather");
const search_input   = document.querySelector(".form-control");
const search_button  = document.querySelector(".btn");
const low_high       = document.querySelector(".low-high");

search_button.addEventListener('click', function(){
    searchResults(search_input.value);
});

search_input.addEventListener('keypress', enter)
function enter(event){
    key = event.keyCode;
    if(key == 13){
        searchResults(search_input.value);
    }
}
function searchResults(city){
    fetch(`${api.base}weather?q=${city}&lang=${api.lang}&units=${api.units}&APPID=${api.key}`)
    .then(response =>{
        if(!response.ok){
            throw new Error(`http error: status ${response.status}`)
        }
        return response.json();
    })
    .catch(error =>{
        alert(error.message);
    })
    .then(response => {
        displayResults(response);
    })
}
function displayResults(weather){
    console.log(weather);
    city.innerText = `${weather.name}, ${weather.sys.country}`;
    
    let now = new Date();
    data.innerText = now;

    let temperatura = `${Math.round(weather.main.temp)}`
    temp_number.innerText = temperatura;
    temp_unit.innerText = `°C`;

    weather_tempo = weather.weather[0].description;
    weather_t.innerText = weather_tempo.toUpperCase(weather_tempo);

    low_high.innerText = `${Math.round(weather.main.temp_min)}°c / ${Math.round(weather.main.temp_max)}°c`;
}