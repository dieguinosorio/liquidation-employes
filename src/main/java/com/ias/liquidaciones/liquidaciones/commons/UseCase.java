package com.ias.liquidaciones.liquidaciones.commons;

public interface UseCase<Input,Output> {
    Output execute(Input input);
}
