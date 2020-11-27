# Project for the presentation about microservice architecture

### Conventions
For the sake of simplicity some of design practices could be violated. For example, I used only Get methods even where it's not appropriate in a real project or fild injection.

### Branches
You can track every change that I made in branches:
1. single_module - Simple app with single module
2. core_module - two maven modules (parent + core). Core is the same as single_module but with a new parent
3. multi_modules - the core module has been split into inventory and orders modules
3.1. (Optional) maven-layered-modules - inventory and orders modules are indpependent apps with layered infrastructure
3.2. (Optional) maven-layered-modules-with-jpa - added jpa and h2 database
4. microservices - all modules are microservices, deleted application module

### (Optional) branches
If branch is (Optional) that mean that those changes is out of the scope of the presentation but there are available ways to further refactoring

## Database
To query a database (if it's available on a branch) just login to the http://localhost:8080/h2-console
