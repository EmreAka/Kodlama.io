package kodlama.io.core.logging;

import kodlama.io.business.CommandService;

public class LoggingCommandServiceDecorator<TCommand> implements CommandService<TCommand> {

    private final CommandService<TCommand> decoratee;
    //inject logger and use it for logging!

    public LoggingCommandServiceDecorator(CommandService<TCommand> decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public void Execute(TCommand command) {
        System.out.println("Logged");
        this.decoratee.Execute(command);
    }
}
