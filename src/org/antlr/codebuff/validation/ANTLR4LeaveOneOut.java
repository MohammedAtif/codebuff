package org.antlr.codebuff.validation;

import org.antlr.codebuff.Formatter;
import org.antlr.v4.runtime.misc.Triple;

import java.util.List;

import static org.antlr.codebuff.Tool.ANTLR4_DESCR;

public class ANTLR4LeaveOneOut {
	public static void main(String[] args) throws Exception {
		LeaveOneOutValidator validator = new LeaveOneOutValidator("corpus/antlr4/training", ANTLR4_DESCR);
		Triple<List<Formatter>,List<Float>,List<Float>> results = validator.validateDocuments(true, true);
		System.out.println(results.b);
		System.out.println(results.c);
	}
}