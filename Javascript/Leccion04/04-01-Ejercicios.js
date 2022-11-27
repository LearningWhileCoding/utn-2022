//Ejercicio 1: Calcular estación 
let mes = 10;
let estacion; //Undefined
console.log(estacion);
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("La estación es: "+estacion);


//Ejercicio 2: Hora del día
let hora = 20;
let resultado;
if(hora >= 7 && hora <= 10){
    resultado = "Es hora de enfocarse";
}
else if(hora >= 11 && hora <= 15){
    resultado = "Es hora de trabajar duro";
}
else if(hora >= 16 && hora <= 18){
    resultado = "Es hora de entrenar";
}
else if(hora >= 19 && hora <= 21){
    resultado = "Es hora de cenar";
}
else if(hora >= 22 && hora <= 24 || hora >= 0 && hora <= 6){
    resultado = "Es hora de dormir";
}
else{
    resultado = "Valor incorrecto";
}
console.log(resultado);

// SWITCH
switch(mes){ //se puede usar también cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estación de: "+estacion);

