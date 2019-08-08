typealias TemplateStringsArray = Array<String>

fun main() {

    // Pass in multiple arguments
    console.log(chalk.blue("Hello", "World!", "Foo", "bar", "biz", "baz"));

    // Nest styles
    console.log(chalk.red("Hello", chalk.underline.bgBlue("world") + "!"));

    // Nest styles of the same type even (color, underline, background)
    console.log(chalk.green(
        "I am a green line " +
                chalk.blue.underline.bold("with a blue substring") +
                " that becomes green again!"
    ));

    // Use RGB colors in terminal emulators that support it.
    console.log(chalk.keyword("orange")("Yay for orange colored text!"));
    console.log(chalk.rgb(123, 45, 67).underline("Underlined reddish color"));
    console.log(chalk.hex("#DEADED").bold("Bold gray!"));
}