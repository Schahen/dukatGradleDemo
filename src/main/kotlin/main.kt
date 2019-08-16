typealias TemplateStringsArray = Array<String>


fun main() {


    // Pass in multiple arguments
    println(chalk.blue("Hello", "World!", "Foo", "bar", "biz", "baz"));

    // Nest styles
    println(chalk.red("Hello", chalk.underline.bgBlue("world") + "!"));

    // Nest styles of the same type even (color, underline, background)
    println(chalk.green(
        "I am a green line " +
                chalk.blue.underline.bold("with a blue substring") +
                " that becomes green again!"
    ));

    // Use RGB colors in terminal emulators that support it.
    println(chalk.keyword("orange")("Yay for orange colored text!"));
    println(chalk.rgb(123, 45, 67).underline("Underlined reddish color"));
    println(chalk.hex("#DEADED").bold("Bold gray!"));
}