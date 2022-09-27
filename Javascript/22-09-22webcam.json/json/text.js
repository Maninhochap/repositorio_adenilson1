const jsonData = '{"team":[' +
'{"firstName":"Jhon", "lastName": "Doe", "age": 10, "phone": "(49)1234-1234"},'+
'{"firstName":"Anna", "lastName": "Smith", "age": 25, "phone": "(49)3213-3123"},'+
'{"firstName":"Peter", "lastName": "Jones", "age": 70, "phone": "(49)5555-6666"}]}';

var jsonObj = JSON.parse(jsonData);
console.log(jsonObj.team[0]);

//document.getElementById("nome").innerHTML = jsonObj.team[0].firstName;
//document.getElementById("sobrenome").innerHTML = jsonObj.team[0].lastName;
//document.getElementById("idade").innerHTML = jsonObj.team[0].age;
//document.getElementById("fone").innerHTML = jsonObj.team[0].phone;

var resultado = jsonObj.team.map((time, indice) => {
  console.log(time.firstName);
  return `<tr>
          <td>${indice + 1}</td>
          <td>${time.firstName}</td>
          <td>${time.lastName}</td>
          <td>${time.age}</td>
          <td>${time.phone}</td>
          </tr>`;
});
document.querySelector("#all tbody").innerHTML = resultado.join("");


