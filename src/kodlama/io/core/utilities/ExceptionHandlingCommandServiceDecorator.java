package kodlama.io.core.utilities;

import kodlama.io.business.CommandService;

public class ExceptionHandlingCommandServiceDecorator<TCommand> implements CommandService<TCommand> {
    private final CommandService<TCommand> decoratee;

    public ExceptionHandlingCommandServiceDecorator(CommandService<TCommand> decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public void execute(TCommand command) {
        try {
            this.decoratee.execute(command);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
