# Spring Boot JTE

A Java Template Engine is a tool that allows developers to generate HTML, XML or other text-based formats using
templates. These templates are typically written in a mix of static text and dynamic placeholders, which are replaced
with actual data at runtime. Here are some key points about Java Template Engines:

1. **Separation of Concerns**: They help in separating the presentation layer from the business logic, making the code
   more maintainable and easier to understand.

2. **Dynamic Content**: They allow the creation of dynamic web pages by embedding variables and control structures (like
   loops and conditionals) within the templates.

3. **Popular Java Template Engines**:
   - **Thymeleaf**: A modern server-side Java template engine for web and standalone environments.
   - **Freemarker**: A Java-based template engine focused on MVC frameworks.
   - **Velocity**: An older template engine that is still in use for various applications.
   - **JTE**: A compile-time checked template engine that ensures type safety and fast rendering.

4. **Integration with Frameworks**: Most Java template engines integrate seamlessly with popular Java web frameworks
   like Spring Boot, making it easy to use them in web applications.

5. **Template Syntax**: Each template engine has its own syntax for defining templates. For example, JTE uses `@` for
   directives and `${}` for variable interpolation.

6. **Performance**: Some template engines, like JTE, focus on performance by compiling templates to Java code, which can
   be faster than interpreting templates at runtime.

Here is an example of how a template engine might be used in a Spring Boot application:

```java

@Controller
public class ExampleController {
   @GetMapping("/example")
   public String example(Model model) {
      model.addAttribute("message", "Hello, World!");
      return "exampleTemplate";
   }
}
```

And the corresponding template (`exampleTemplate.jte` for JTE):

```unknown
@template.layout.main(content = @`
    <div>
        <p>${message}</p>
    </div>
`)
```

In this example, the `TemplateController` adds a message to the model, which is then rendered in the
`exampleTemplate.jte` template. The placeholder `${message}` is replaced with the actual message at runtime.

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-jte1.git`
2. Navigate to the folder: `cd spring-boot-jte1`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: http://localhost:8080/
