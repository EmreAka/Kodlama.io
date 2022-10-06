package kodlama.io.business;

public interface CommandService<TCommand> {
    void execute(TCommand command) throws Exception;
}
