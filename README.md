# 🚗 Sistema de Alquiler de Vehículos

## 📝 Introducción
Este proyecto es un **sistema de alquiler de vehículos** desarrollado en **Java**.  
Permite gestionar:

- Vehículos (automóviles y camionetas)  
- Clientes  
- Reservas  
- Alquileres  
- Comprobantes  
- Inspecciones  

El objetivo es centralizar y organizar toda la lógica de negocio de un servicio de alquiler, aplicando **herencia, composición y agregación**, para que todo sea escalable y fácil de mantener.

---

## 📂 Estructura de Carpetas

src/
Main.java
gui/
AlquilerUI.java
ClienteUI.java
ComprobanteUI.java
InspeccionUI.java
MainUI.java
ReservaUI.java
VehiculoUI.java
modelo/
Alquiler.java
Automovil.java
Camioneta.java
Cliente.java
Comprobante.java
Inspeccion.java
Reserva.java
Vehiculo.java
servicio/
SistemaAlquiler.java


---

## 🏷️ Descripción de Clases

### **Vehiculo (abstracta)**
- Base para **Automovil** y **Camioneta**  
- Atributos: `id`, `marca`, `modelo`, `anio`, `tarifaDiaria`, `disponible`  
- Métodos: `calcularTarifa()`, `obtenerDescripcion()`  
- Relaciones: herencia con **Automovil** y **Camioneta**, agregación con **Alquiler**  

### **Automovil**
- Hereda de **Vehiculo**  
- Atributos: `numPuertas`, `tipoCombustible`  
- Método sobrescrito: `calcularTarifa()`  

### **Camioneta**
- Hereda de **Vehiculo**  
- Atributos: `capacidadCarga`, `tieneDobleCabina`  
- Método sobrescrito: `calcularTarifa()`  

### **Cliente**
- Representa a los clientes  
- Atributos: `id`, `nombre`, `apellido`, `dni`, `telefono`  
- Métodos: `registrar()`, `buscarReservas()`  
- Relaciones: 1 a muchos con **Reserva**  

### **Reserva**
- Atributos: `id`, `fechaInicio`, `fechaFin`, `estado`, `vehiculo`, `cliente`  
- Métodos: `calcularCosto()`, `confirmar()`, `cancelar()`  
- Relaciones: agregación con **Cliente** y **Vehiculo**, puede originar un **Alquiler**  

### **Alquiler**
- Atributos: `id`, `fechaEntrega`, `fechaDevolucion`, `importeTotal`, `estado`, `reservaAsociada`, `vehiculo`, `cliente`  
- Métodos: `iniciarAlquiler()`, `finalizarAlquiler()`, `calcularImporteTotal()`  
- Relaciones: agregación con **Vehiculo**, **Cliente**, **Reserva**; composición con **Comprobante** e **Inspeccion**  

### **Comprobante**
- Atributos: `id`, `fechaEmision`, `detalle`, `monto`, `alquiler`  
- Métodos: `generarComprobante()`  
- Relaciones: composición con **Alquiler**  

### **Inspeccion**
- Atributos: `id`, `tipo`, `fecha`, `observaciones`, `vehiculo`, `alquiler`  
- Métodos: `registrarInspeccion()`  
- Relaciones: composición con **Alquiler**, agregación con **Vehiculo**  

### **SistemaAlquiler**
- Clase principal que gestiona **vehículos, clientes, reservas y alquileres**  
- Métodos: agregar/eliminar/buscar vehículos, registrar cliente, crear reservas, iniciar/finalizar alquileres, generar reportes  
- Relaciones: composición implícita con **Vehiculo, Cliente, Reserva, Alquiler**  

---

## 👥 División del Trabajo

| Integrante | Clases a Implementar |
|------------|--------------------|
| Integrante 1 | Vehiculo, Automovil |
| Integrante 2 | Camioneta, Cliente |
| Integrante 3 | Reserva, Alquiler |
| Integrante 4 | Comprobante, Inspeccion |
| Integrante 5 | SistemaAlquiler, Main |

> Cada integrante debe probar sus clases antes de hacer push y documentar cualquier método especial que agregue.

---

## 🏗️ Reglas de Git

1. Cada integrante trabaja en su **rama personal** (`rama-nombre`).  
2. Antes de hacer push: `git pull origin main` para actualizar la rama local.  
3. Commits claros y frecuentes, con formato:  
