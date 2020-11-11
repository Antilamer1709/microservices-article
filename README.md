# Project for the presentation about microservice architecture

### Conventions
For the sake of simplicity some of design practices could be violated. For example, I used only Get methods even where it's not appropriate in a real project or fild injection.

### Branches
You can track every change that I made in branches:
1. single_module - Simple app with single module
2. maven_core_module - two maven modules (parent + core). Core is the same as single_module but with a new parent
3. multi_modules - the core module has been split into inventory and orders modules
4. microservices - all modules are microservices, deleted application module