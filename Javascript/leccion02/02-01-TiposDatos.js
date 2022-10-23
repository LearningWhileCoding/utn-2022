// Tipos de Datos en JavaScript


var name = 'Augusto'; //Tipo Str
console.log(name);

var number = 3000; // Tipo Numérico
console.log(number);

var object = {
    name : "Augusto",
    lastname : "Britos",
    phone : "3518656727"
}

console.log(object);

//Tipo de dato boolean
var flag = true;
console.log(typeof flag);

//Tipo de dato funcion
function miFunction(){}
console.log(typeof miFunction);

//Tipo de dato symbol
var symbol = Symbol("My symbol");
console.log(typeof symbol);

//Tipo de dato clase 
class Person{
    constructor(name, lastname){
        this.name = name;
        this.lastname = lastname;
    }
}

console.log(typeof Person);

//Tipo de dato undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

// null = Ausencia de valor
var y = null; //No es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

// Tipo de dato Array y Empyt String
var autos = ['Audi', 'Mazda', 'Bmw', 'Lamborghini',];
console.log(autos);
console.log(typeof autos);

var z = '';
console.log(z); //Esto se refiere a que es un Empty String 
console.log(typeof z);

// Tipo de dato Array y Empyt String
var autos = ['Audi', 'Mazda', 'Bmw', 'Lamborghini',];
console.log(autos);
console.log(typeof autos);

var z = '';
console.log(z); //Esto se refiere a que es un Empty String 
console.log(typeof z);