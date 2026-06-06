# PRACTICAS-9-10-EED-2026

## Descripción
Repositorio con las 5 prácticas de la asignatura, centradas en
herramientas de calidad, testing y documentación en Java con Eclipse.

---

## Práctica 1 — JUnit: Tests Unitarios
Implementación de la clase `Rectangle` con sus métodos `surface()` 
y `perimeter()`, junto con un juego de pruebas completo en JUnit 5.

**Casos probados:**
- ✅ Valores positivos
- ✅ Valores negativos → devuelve -1
- ✅ Valores cero → devuelve 0
- ✅ Ambos negativos
- ✅ Ambos cero
- ❌ Aserción errónea intencionada (para verificar detección de fallos)


El proyecto que corresponde a este ejercicio sería el de **"Ejemplo1"**
---

## Práctica 2 — EclEmma: Cobertura de Tests
Análisis de cobertura del juego de pruebas usando el plugin EclEmma.

**Resultados:**
- `Rectangle.java` → **100% de cobertura** ✅
- `RectangleTest.java` → 97% (el 3% restante corresponde 
al test erróneo intencionado)

Los archivos que corresponden a este ejercicio son los de **"index" y "Informe EclEmma"**

---

## Práctica 3 — SonarQube: Análisis de Calidad
Análisis estático del código con SonarQube 
(alternativa a SonarLint por disponibilidad en el Marketplace).

**Herramientas comparadas:**

| | SonarLint | SonarQube |
|---|---|---|
| Uso | Individual en IDE | Equipos / servidor |
| Análisis | Tiempo real | Bajo demanda |
| Histórico | No | Sí |
| Configuración | Mínima | Requiere servidor |

El PDF que corresponde a este ejercicio es el de **"SonarLint - Raúl Beltrán (Ejercicio 3)"**

---

## Práctica 4 — Refactorización con Eclipse
Refactorización del proyecto usando las herramientas built-in de Eclipse.

**Cambios aplicados:**
- Extracción de la constante `SIDES = 2`
- Renombrado: `area()` → `surface()`, `perimetro()` → `perimeter()`
- Renombrado: clase `Rectangulo` → `Rectangle`
- Extracción del método `validateParams()`

El proyecto que corresponde a este ejercicio sería el de **"Ejemplo"**

---

## Práctica 5 — Javadoc & README
- Documentación completa con Javadoc (autor, versión, @param, @return) --> Correspondiente carpeta **"doc"**
- Este README redactado en Markdown

---

## Tecnologías utilizadas
- Java 21
- Eclipse IDE
- JUnit 5
- EclEmma
- SonarQube

## Autor
**Raúl Beltrán Gracia**  
Curso: 2025-2026
