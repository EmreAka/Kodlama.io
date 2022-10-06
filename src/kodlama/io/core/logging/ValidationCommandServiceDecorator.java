package kodlama.io.core.logging;

import kodlama.io.business.CommandService;

public class ValidationCommandServiceDecorator<TCommand> implements CommandService<TCommand> {


    @Override
    public void Execute(TCommand command) {

    }
}
