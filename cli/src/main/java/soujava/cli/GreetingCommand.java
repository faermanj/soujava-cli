package soujava.cli;

import io.quarkus.runtime.QuarkusApplication;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "greeting", mixinStandardHelpOptions = true)
public class GreetingCommand implements Runnable, QuarkusApplication  {
    

    @Parameters(paramLabel = "<name>", defaultValue = "picocli",
        description = "Your name.")
    String name;

    @Override
    public void run() {
        System.out.printf("Hello %s, go go commando!\n", name);
    }

    @Override
    public int run(String... args) throws Exception {
        run();
        return 0;
    }

}
