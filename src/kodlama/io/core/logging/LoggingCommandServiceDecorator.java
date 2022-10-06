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
    public void Execute(TCommand command) {
        this.logger.log("TEST");
        this.decoratee.Execute(command);
    }






}
