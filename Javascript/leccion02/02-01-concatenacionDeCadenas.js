var nombre = 'Homero ';
var apellido = 'Simpson';
var nombreCompleto = nombre+' '+apellido;
console.log(nombreCompleto);


var nombreCompleto2 = 'Bart'+' '+'Simpson';
console.log(nombreCompleto2);
var juntos = nombre + 515; // Lee el numero como String.
console.log(juntos);
juntos = nombre + (37 + 25); // Los numeros dentro del parenteis suman.
console.log(juntos)
juntos = 37 + 25 + nombre;
console.log(juntos);

nombre += apellido; // Otra maera de concatenar.
console.log(nombre)


let nombre2 = "Marge"; // Ya no se usa var, sino let y/o const.
console.log(nombre2);

const apellido2 = "Simpson"; // const = final.
console.log(apellido2);

let x, y; // Se pueden crear varias variables dentro de una misma linea.
x = 25, y = 35; // Se pueden asignar varias variables dentro de la misma linea.
let z = x + y; 
console.log(z);