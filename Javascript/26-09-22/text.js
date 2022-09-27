//const response = fetch('https://jsonplaceholder.typicode.com/posts')
//.then(data => {
//return data.json()
//})
//.then(function (jData) {
//  console.log(jData)
//})
//.catch(function(e){
//  console.log(e)
//})
(async function () {
  try {
    const response = await fetch('https://jsonplaceholder.typicode.com/posts')
    const data = await response.json()
    console.log(data)
    var resultado = data.map((post) => {
      return `
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">${post.id} - ${post.title}</h5>
            <p class="card-text">${post.body}</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
          </div>
        </div>
        `;
    })
    document.querySelector("#mostrar").innerHTML = resultado.join("");
  } catch (e) {
    console.log(e)
  }
})()
