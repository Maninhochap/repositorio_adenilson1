const jsonData = '{"team":[' +
'{"firstName":"Jhon", "lastName": "Doe", "age": 10, "phone": "(49)1234-1234"},'+
'{"firstName":"Anna", "lastName": "Smith", "age": 25, "phone": "(49)3213-3123"},'+
'{"firstName":"Peter", "lastName": "Jones", "age": 70, "phone": "(49)5555-6666"}]}';

var jsonObj = JSON.parse(jsonData);
console.log(jsonObj.team[0]);

document.getElementById("nome").innerHTML = jsonObj.team[0].firstName;
document.getElementById("sobrenome").innerHTML = jsonObj.team[0].lastName;
document.getElementById("idade").innerHTML = jsonObj.team[0].age;
document.getElementById("fone").innerHTML = jsonObj.team[0].phone;

document.getElementById("nome1").innerHTML = jsonObj.team[1].firstName;
document.getElementById("sobrenome1").innerHTML = jsonObj.team[1].lastName;
document.getElementById("idade1").innerHTML = jsonObj.team[1].age;
document.getElementById("fone1").innerHTML = jsonObj.team[1].phone;

document.getElementById("nome2").innerHTML = jsonObj.team[2].firstName;
document.getElementById("sobrenome2").innerHTML = jsonObj.team[2].lastName;
document.getElementById("idade2").innerHTML = jsonObj.team[2].age;
document.getElementById("fone2").innerHTML = jsonObj.team[2].phone;


