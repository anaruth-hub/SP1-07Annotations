# SP1-07Annotations

**Description:** Maven-based Java project with exercises to practice **Java annotations**:
- Standard annotations: `@Override`, `@Deprecated`
- Custom annotation creation
- Reading annotations at runtime using **Java Reflection**
- Serializing a Java object into a **JSON file** based on an annotation parameter (output directory)

---

## 📌 Exercise statement

This repository is organized by levels and exercises:

### Level 1 — Basic annotations
**Exercise 1 — `@Override`**  
Create a class hierarchy with:
- `Worker` (base): `name`, `lastname`, `priceHours` and `calcularSou(int hoursWorkedMonth)`
- `OnlineWorker` (child): overrides salary calculation and adds an **internet flat rate**
- `OnsiteWorker` (child): overrides salary calculation and adds a **static gas bonus** (`benzina`)

**Exercise 2 — `@Deprecated`**  
Add deprecated methods to child classes and invoke them from an external class, suppressing warnings with `@SuppressWarnings("deprecation")`.

### Level 2 — Custom annotation
**Exercise 1 — JSON Serialization**  
Create a custom annotation to mark a class as JSON-serializable and provide a **destination directory**. Use Reflection to:
- read the annotation
- create the directory
- generate a `.json` file from the object fields

---

## 🧭 Project structure

```text
src/main/java/
├── level01a/
│   ├── Main.java
│   ├── Worker.java
│   ├── OnlineWorker.java
│   └── OnsiteWorker.java
├── level01b/
│   ├── Main.java
│   ├── BunnyWorker.java
│   ├── CozyRemoteWorker.java
│   ├── SunnyOnsiteWorker.java
│   └── NostalgiaCaller.java
└── level02/
    ├── Main.java
    ├── JsonCuteSerializable.java
    ├── JsonCuteWriter.java
    └── SweetPerson.java
flowchart TD
  A[Level 01a: @Override] --> A1[Worker]
  A1 --> A2[OnlineWorker]
  A1 --> A3[OnsiteWorker]

  B[Level 01b: @Deprecated] --> B1[BunnyWorker]
  B1 --> B2[CozyRemoteWorker]
  B1 --> B3[SunnyOnsiteWorker]
  B --> B4[NostalgiaCaller]

  C[Level 02: Custom Annotation + JSON] --> C1[@JsonCuteSerializable]
  C --> C2[SweetPerson]
  C --> C3[JsonCuteWriter]
  C2 --> C3
  C3 --> C4[cute-json-output/SweetPerson.json]
✨ Features

Demonstrates polymorphism via method overriding (@Override)

Adds deprecated methods and suppresses warnings safely

Defines a custom annotation with parameters (directory)

Uses Reflection to inspect annotations and fields at runtime

Generates a JSON output file from object fields (no external JSON libraries)

🛠 Technologies

Java (JDK 21 used during development)

Maven (pom.xml)

IntelliJ IDEA

Git + GitHub

🚀 How to run
Option A — Run from IntelliJ (recommended)

Open the project root (folder containing pom.xml)

Navigate to the Main class you want to run

Right click → Run

▶️ Exercises
✅ Level 01a — Exercise 1 (@Override)

Package: level01a
Entry point: level01a.Main

Expected output (example):

Prints worker info and salaries for onsite and online workers

Onsite salary includes the static gas bonus (benzina)

Online salary includes the internet flat rate
✅ Level 01b — Exercise 2 (@Deprecated)

Package: level01b
Entry point: level01b.Main

Expected output (example):

Prints messages from deprecated methods (called through NostalgiaCaller)

Deprecation warnings are suppressed via @SuppressWarnings("deprecation")

✅ Level 02 — Exercise 1 (Custom annotation → JSON)

Package: level02
Entry point: level02.Main

Output:

Creates a directory defined in @JsonCuteSerializable(directory="...")

Generates SweetPerson.json inside that directory

Example JSON:
{
  "firstName": "Ari",
  "lastName": "Bruno",
  "age": 27
}

🧪 Tests

This repository contains console-based exercises and does not include automated tests (JUnit) at this stage.

📂 Generated output (important)

The Level 02 exercise creates output files, e.g.:

cute-json-output/

These are generated artifacts and are typically not versioned.

Recommended .gitignore entry:
cute-json-output/
out/
target/
.idea/
*.iml

📌 Notes

This repository focuses on learning annotation concepts used by frameworks such as Spring and JPA.

JSON generation is intentionally implemented without third-party libraries to practice Reflection and core Java APIs.
