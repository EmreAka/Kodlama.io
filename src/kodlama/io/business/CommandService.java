package kodlama.io.business;

public interface CommandService<TCommand> {
    void Execute(TCommand command);
}
