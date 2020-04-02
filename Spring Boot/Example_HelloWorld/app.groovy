// To create this file the command in cmd was "type nul > app.groovy"

@RestController  // this annotation is to write the text into a browser
public class HelloWorld{

    @RequestMapping("/")  // this maps the entire method to the 
    public String home(){
        "Hello World! :)"
    }
}

// This is a web app, and you can run it in cmd with "run app.groove"