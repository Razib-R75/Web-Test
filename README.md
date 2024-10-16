# Web Automation Framework

This repository contains a Web Automation Framework using Java, Selenium, TestNG, and BDD with the Page Object Model (POM) design pattern. The framework utilizes Allure for detailed test reporting.

## Table of Contents
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Framework Structure](#framework-structure)
- [Running the Tests](#running-the-tests)
- [Reporting](#reporting)
- [Built With](#built-with)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To get a local copy up and running, follow these steps.

### Prerequisites

- **Java**: Ensure you have JDK 8 or above installed. [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven**: Required for dependency management. [Download Maven](https://maven.apache.org/download.cgi)
- **IDE**: Any Java-supported IDE like IntelliJ or Eclipse.

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/web-automation-framework.git
   ```
2. Navigate to the project directory:
   ```sh
   cd web-automation-framework
   ```
3. Install Maven dependencies:
   ```sh
   mvn clean install
   ```

## Framework Structure

```plaintext
src
├── main
│   └── java
│       └── com.example.web.automation.pages         # Page Object Model classes
├── test
│   └── java
│       └── com.example.web.automation.tests         # Test classes
│       └── com.example.web.automation.steps         # Step Definitions for BDD
│   └── resources
│       └── features                                 # BDD feature files
├── pom.xml                                          # Maven dependencies
```

### Key Components

- **Page Object Model (POM)**: This design pattern organizes web elements and interactions separately from test logic.
- **BDD with TestNG**: Allows structuring test cases in a more readable, BDD format using feature files.
- **Allure Reporting**: Provides a detailed visual report for test results.

## Running the Tests

To execute all tests, run:

```sh
mvn test
```

For running a specific suite, you can use:

```sh
mvn test -DsuiteXmlFile=<suite-file.xml>
```

## Reporting

After tests are executed, generate an Allure report with:

```sh
allure serve allure-results
```

## Built With

- **Java** - Programming language for test scripts
- **Selenium** - Automates web browsers
- **TestNG** - Test framework for structuring and executing tests
- **Allure** - Reporting tool for test result visualization
- **BDD** - Behavior Driven Development for feature management

## Contributing

Contributions are what make the open-source community such an incredible place to learn, inspire, and create. Any contributions are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

---
