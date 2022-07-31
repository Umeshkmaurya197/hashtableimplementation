package com.hashtable;


public class HashTable<K, V> {
	MapNode<K, V> firstNode;

	public void put(K key, V value) {
		MapNode<K, V> newNode = new MapNode<>(key, value);
		if (firstNode == null) {
			firstNode = newNode;
			return;
		}
		MapNode<K, V> currentNode = firstNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

	public void printMap() {
		if (firstNode == null) {
			System.out.println(" Empty Map ");
			return;
		}
		MapNode<K, V> currentNode = firstNode;
		while (currentNode != null) {
			System.out.println("[key = " + currentNode.key + ", value = " + currentNode.value + "]");
			currentNode = currentNode.next;
		}

	}

	public void get(K inputKey) {
		if (firstNode == null) {
			System.out.println(" Empty Map ");
			return;
		}
		MapNode<K, V> currentNode = firstNode;
		while (currentNode != null) {
			if (currentNode.key == inputKey) {
				System.out.println(currentNode.value + " ");
			}
			currentNode = currentNode.next;
		}
		System.out.println(" ");
	}

	public MapNode<K, V> replaceValue(K keyy, V valuee) {
		MapNode<K, V> currentNode = firstNode;
		while (currentNode != null) {
			if (currentNode.key == keyy) {
				currentNode.setValue(valuee); // not able to uderstand how to {1=[amit, omi, ravi]}
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		return null;
	}

	public static void main(String[] args) {
		HashTable<Integer, String> dataHashMapp = new HashTable<Integer, String>();
		dataHashMapp.put(1, "Shiv");
		dataHashMapp.put(3, "Lucifer");
		dataHashMapp.printMap(); // [key = 1, value = Shiv] [key = 3, value = Lucifer]

		System.out.println(" ");
		dataHashMapp.replaceValue(3, "Luci");
		dataHashMapp.printMap(); // [key = 1, value = Shiv] [key = 3, value = Luci]

		dataHashMapp.get(3);
	}
}
