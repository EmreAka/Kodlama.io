package kodlama.io.core.logging;

import kodlama.io.business.CommandService;

public class LoggingCommandServiceDecorator<TCommand> implements CommandService<TCommand> {

    private final CommandService<TCommand> decoratee;
    private final Logger logger;

    public LoggingCommandServiceDecorator(CommandService<TCommand> decoratee, Logger logger) {
        this.decoratee = decoratee;
        this.logger = logger;
    }

    @Override
    public void execute(TCommand command) {
        this.logger.log("Command");
        this.decoratee.execute(command);
    }
}
