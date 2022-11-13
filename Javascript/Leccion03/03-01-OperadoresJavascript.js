// Hallar numeros impares.

let parInpar = 10;

if(parInpar % 2 == 0){
    console.log("Es Par.");
}
else{
    console.log("Es Impar.");
}

// Mayor de edad
let edad = 20, adulto = 18;

if(edad >= adulto){
    console.log("Es mayor.")
}
else{
    console.log("No es mayor.")
}

// Ejercicio de rangos
let dentroRango = 5;
let valMin = 0, valMax = 10;

if(dentroRango >= valMin && dentroRango <= valMax) {
    console.log("Esta dentro del rango.");
} else {
    console.log("Esta fuera del rango.");
}

//Ejercicio condicional
let vacaciones = true, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego.")
}
else{
    console.log("El padre no puede asistir al juego.")
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)
let numero = 12;
resultado2 = numero % 2 == 0 ? "Es PAR." : "Es IMPAR.";
console.log(resultado2)

//Conversión de String a Number
let miNumero = "21"; 
console.log(typeof miNumero);
let edad2 = Number(miNumero); //-->Función
console.log(typeof edad2);
//Función isNaN
if(isNaN(edad2)){ //Is Not a Number(devuelve un resultado booleano)
    console.log("Esta variable no contiene solo numeros.")
}
else{
    if(edad2 >= 18){
        console.log("Puede votar.");
    }
    else{
        console.log("No puede votar.");
    }
}

//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar." : "No puedevotar.";
console.log(resultado3);
