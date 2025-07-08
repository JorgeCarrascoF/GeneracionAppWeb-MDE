# 🧠 DataWeb: Generación de Aplicaciones Web desde Modelos EMF

Este proyecto se centra en el MDE (Model-Driven Development). Permite definir, validar y generar aplicaciones web completas a partir de un modelo conceptual creado con **Eclipse Modeling Framework (EMF)**. A través de un metamodelo y plantillas personalizadas con **Acceleo**, el sistema transforma especificaciones abstractas en interfaces funcionales y coherentes.

El proyecto include modelos de prueba con extensión .xmi dentro de webapplicationmodels, y las correspondientes generaciones de código en applicationgen.

---

## 📚 Descripción General

El usuario modela una **aplicación educativa o de gestión** mediante clases como:

- `Aplicacion`
- `Entidad` (ej: `Titulo`, `Asignatura`)
- `PaginaDeEntidad`, `PaginaIndice`, `PaginaCRUDUnica`
- Atributos, roles, relaciones

Una vez definida la estructura, se utilizan reglas **OCL** para validar consistencia, y plantillas **Acceleo** para generar automáticamente:

- Interfaces HTML estilizadas
- Navegación entre páginas
- Vistas CRUD e índices
- Cuestionarios y encuestas
---

## 🧩 Estructura del Metamodelo

### Entidades Principales

| Elemento      | Descripción                                              |
|---------------|----------------------------------------------------------|
| `Entidad`     | Representa una entidad de la aplicación                  |
| `Atributo`    | Representa una característica de una entidad             |
| `Pagina`      | Página web de la aplicación                              |
| `Rol`         | Controla acceso a páginas                                |


### Navegación

- Cada página puede tener enlaces salientes generados dinámicamente.
- Las `PaginasDeEntidad` se vinculan a una `Entidad`.

---

## ✅ Validaciones OCL

El modelo incluye reglas para asegurar la coherencia semántica:

- `R01`: Solo puede haber una página Index/Home.
- `R02`: Asociar a una entidad la funcionalidad CRUD es incompatible con asignarle las funcionalidades de forma individual.
- `R03`: Si una entidad tiene funcionalidad Índice/ÍndiceExtendido, debe tener asociada la funcionalidad Detalle, y viceversa.
- `R04`: La aplicación debe contener, al menos, un enlace a red social.
- `R05`: Una entidad no puede referenciarse a sí misma.
- `R06`: Una entidad no puede estar referenciada por ninguna de las entidades a las que referencia.
- `R06b`: La aplicación contiene al menos una encuesta y un cuestionario.
- `R07`: Las preguntas de un cuestionario deben tener respuesta no vacía.
- `R08`: Cada entidad solo puede tener una página de tipo Índice.
- `R09`: Los atributos mostrados en una página deben pertenecer a su entidad.


---

## 🛠️ Generación con Acceleo

La plantilla Acceleo recorre el modelo y genera archivos `.html` con estilos modernos:

- Gradientes, tipografías limpias y diseño responsivo
- Tablas dinámicas para CRUD e índices
- Enlaces con estilo para navegación entre páginas

---

## 🧪 Flujo de trabajo

1. Modelado en Eclipse usando el editor GMF (`en Eclipse, click derecho en dmss.dataweb.diagram -> Run As -> Launch as Java Application`)
2. Creación de un modelo mediante las herramientas gráficas de modelado
3. Validación del modelo (`abrir el archivo .diagram -> clic derecho en el elemento raíz → Validate`)
4. Generación automática mediante Acceleo(`en Eclipse, click derecho en dmss.dataweb.acceleo/src/dataweb/acceleo/main/generate.mtl -> Run As -> Launch Acceleo Application`)
5. Revisión o despliegue de los archivos HTML generados y de la aplicación de escritorio

---

## 📝 Requisitos

- Eclipse Modeling Tools con plugins EMF y Acceleo
- Java 17+ para ejecutar transformaciones
- Navegador moderno para visualizar las páginas generadas

---

## 🔍 Casos de uso posibles

- Generador de portales educativos
- Portal de biblioteca
- Página web de un hospital