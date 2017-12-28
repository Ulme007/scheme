package com.ulme.antlr.calc;

import org.antlr.v4.runtime.Token;

public class FunctionAlreadyDefinedException extends CompileException {

    private String functionName;

    FunctionAlreadyDefinedException(Token methodNameToken, String functionName) {
        super(methodNameToken);
        this.functionName = functionName;
    }

    @Override
    public String getMessage() {
        return getLine() + ":" + getColumn() + " function already defined: <" + functionName + ">";
    }

}