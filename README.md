![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | SpringBoot Fundamentals

### Instructions

1. Fork this repo.
2. Clone your fork to your local machine.
3. Solve the challenges.

  
## Deliverables

- Upon completion, add your solution to git.
- Then commit to git and push to your repo on GitHub.
- Make a pull request and paste the pull request link in the submission field in the Student Portal.

## Tasks

1. Create a Spring Boot application using Spring Initializr with the following dependencies:
   - Spring Web
   - Spring Boot DevTools

2. Create a `GreetingController` class that has the following endpoints:
   - `/hello` - Returns "Hello World!"
   - `/hello/{name}` - Returns "Hello {name}!" where {name} is a path variable
   - `/add/{num1}/{num2}` - Returns the sum of num1 and num2
   - `/multiply/{num1}/{num2}` - Returns the product of num1 and num2

3. Create a `WeatherService` class that has methods to:
   - Get current temperature (simulate with random number between -10 and 40)
   - Get weather condition (randomly return: "Sunny", "Rainy", "Cloudy", "Windy")
   - Get wind speed (simulate with random number between 0 and 100)

4. Create a `WeatherController` class that uses constructor injection to receive the `WeatherService` and has endpoints to:
   - `/weather/temperature` - Returns current temperature
   - `/weather/condition` - Returns current weather condition
   - `/weather/wind` - Returns current wind speed
   - `/weather/all` - Returns all weather information in a single response

5. Create a `TimeService` class that has methods to:
   - Get current time
   - Get current date
   - Get current day of the week

6. Create a `TimeController` class that uses constructor injection to receive the `TimeService` and has endpoints to:
   - `/time` - Returns current time
   - `/date` - Returns current date
   - `/day` - Returns current day of the week
   - `/all` - Returns all time information in a single response

**Remember**:
- Use proper package structure
- Use constructor injection instead of @Autowired
- Test all endpoints using your web browser or Postman
- Include appropriate error handling
- Use meaningful variable and method names
