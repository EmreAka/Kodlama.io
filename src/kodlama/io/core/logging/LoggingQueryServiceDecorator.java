package kodlama.io.core.logging;

import kodlama.io.business.QueryService;

public class LoggingQueryServiceDecorator<TQuery> implements QueryService<TQuery> {

    private final QueryService<TQuery> decoratee;
    private final Logger logger;

    public LoggingQueryServiceDecorator(QueryService<TQuery> decoratee, Logger logger) {
        this.decoratee = decoratee;
        this.logger = logger;
    }

    @Override
    public void execute() {
        this.logger.log("Query");
        this.decoratee.execute();
    }
}
