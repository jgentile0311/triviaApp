/*
 * QuestionAccesible class
 * Author: Jimmy Gentile
 * Date: November 25, 2018
*/

package com.trivia.jimmy_trivia.model;

import java.util.List;

public interface QuestionAccessible {
	
	    /**
	     * Returns a {@link Question} by index.
	     * 
	     * @param index the index of the question
	     * @return an  question by index
	     */
	    Question getQuestionByIndex(long index);
	    
	    /**
	     * Returns a {@link Question} by index.
	     * 
	     * @param id the identifier of the question
	     * @return a question by index
	     */
	    Question getQuestionById(long id);
	    
	    /**
	     * Returns a random {@link Question}
	     * 
	     * @return a random trivia question
	     */
	    Question getRandomQuestion();
	    
	    /**
	     * Returns a list of at most 10 {@link Question} starting at the offset
	     * 
	     * @param offset the starting point
	     * @return a list of at most 10 questions starting the offset
	     */
	    List<Question> getQuestionList(long offset);
	    
	    /**
	     * Returns a list of at most 10 {@link Question} starting at the offset
	     * 
	     * @param id
	     * @return a list of at most 10 questions starting the offset
	     */
	    List<Question> getSpecifiedQuestionList(long... id);
	    
	    /**
	     * Returns the total number of {@link Question} in the database
	     * 
	     * @return the number of trivia questions
	     */
	    long getQuestionListSize();	
	}


