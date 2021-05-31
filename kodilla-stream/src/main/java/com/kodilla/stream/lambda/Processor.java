package com.kodilla.stream.lambda;

public class Processor {
    Executor executor;

    public void execute(Executor executor){
        executor.process();
    }
}
