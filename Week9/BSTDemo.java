package week9;

import java.util.Random;

/*
 * BSTDemo.java - Class to demonstrate a binary search tree.
 * 
 * @author: @professorgordon
 * @url: http://johngordon.io/javaadvancedtrees.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 *
 **/

public class BSTDemo {
	public static void main(String[] args) {

		int nanoDivisor = 1000000000;

		BinarySearchTree bst = new BinarySearchTree();
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			int number = rnd.nextInt(1000)+100;
			bst.insert(number);
		}

		System.out.print("PreOrder Traverse:\t");
		long start = System.nanoTime();

		bst.preOrderTraverse(bst.root);

		long end = System.nanoTime();
		long duration = end - start;
		double seconds = (double)duration/nanoDivisor;
		System.out.printf("%nDuration: %,d nanoseconds [%.10f seconds]%n", duration, seconds);

		System.out.println();
		System.out.print("InOrder Traverse:\t");

		start = System.nanoTime();
		bst.inOrderTraverse(bst.root);
		end = System.nanoTime();
		duration = end - start;
		seconds = (double)duration/nanoDivisor;
		System.out.printf("%nDuration: %,d nanoseconds [%.10f seconds]%n", duration, seconds);

		System.out.println();
		System.out.print("PostOrder Traverse:\t");
		
		start = System.nanoTime();
		bst.postOrderTraverse(bst.root);
		end = System.nanoTime();
		duration = end - start;
		seconds = (double)duration/nanoDivisor;
		System.out.printf("%nDuration: %,d nanoseconds [%.10f seconds]%n", duration, seconds);
		System.out.println();

		System.out.println("Depth: " + bst.depth(bst.root));
		System.out.println("Search: " + bst.search(bst.root, 20));

		bst.delete(bst.root, 33);

		System.out.print("Deleted Node PreOrder Traverse:\t");
		bst.preOrderTraverse(bst.root);
		System.out.println();
	}
}
