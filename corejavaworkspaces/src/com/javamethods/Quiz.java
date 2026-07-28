package com.javamethods;

public class Quiz {
	String subject;
	int totalQuestions;
	int timeLimit;
	Quiz(){
		this("Unknown");
		System.out.println("No arg Constructor called");
	}
	Quiz(String subject){
		this(subject,10);
		System.out.println("One Arg Constructor called");
	}
	Quiz(String subject,int totalQuestions){
		this(subject,totalQuestions,120);
		System.out.println("Two Arg Constructor called");
	}
	public Quiz(String subject, int totalQuestions, int timeLimit) {
		this.subject = subject;
		this.totalQuestions = totalQuestions;
		this.timeLimit = timeLimit;
		System.out.println("Three Arg Constructor called");
	}
	void display() {
		System.out.println(subject);
		System.out.println(totalQuestions);
		System.out.println(timeLimit);
	}

	public static void main(String[] args) {
		Quiz q = new Quiz();
		q.display();
	}

}
