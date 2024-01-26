# Un ejercicio de arrays más

# Ejercicio: Define tres arrays de 20 números enteros cada uno, con los nombres siguientes: numero, cuadrado y cubo. Carga (o inicializa) el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar los cubos de los valores que hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.


# Pista para el pintado de los tres arrays:

# System.out.printf es un método para imprimir texto formateado en la consola. Similar a System.out.println, pero permite un formato más detallado del texto.

## Si indicamos "%-10s %-10s %-10s%n" en una cadena de formato tendremos lo siguiente:

## Cada %s indica que se espera una cadena de caracteres (String). 
## El -10 especifica que cada cadena de caracteres debe tener un ancho mínimo de 10 caracteres.

# Así podríamos aplicar el siguiente formato: "%-10d %-10d %-10d%n"

## %d: Indica que se espera un número entero (int).
## -10: Establece un ancho mínimo de 10 caracteres para cada número. Si el número tiene menos de 10 dígitos, se añaden espacios hasta completar los 10 caracteres.
## -: Indica que la alineación del número será a la izquierda dentro de esos 10 espacios.
## %n: Representa un salto de línea, similar a \n.

# Pseudocódigo

      program CalculoDeCuadradosYCubos;
      
      constante
          TAMANO = 20;
      
      variables
          numero, cuadrado, cubo: array[1..TAMANO] of integer;
          i: integer;
      
      begin
          // Inicializar los arrays
          for i := 1 to TAMANO do
            // Asignar un valor aleatorio entre 0 y 100 al array numero
            numero[i] := random(101);
      
            // Calcular el cuadrado y el cubo de dicho número
            cuadrado[i] := numero[i] * numero[i];
            cubo[i] := numero[i] * numero[i] * numero[i];
      
          // Mostrar los resultados
          writeln('Numero   Cuadrado   Cubo');
          for i := 1 to TAMANO do
              writeln(numero[i]:7, cuadrado[i]:10, cubo[i]:7);
      end
