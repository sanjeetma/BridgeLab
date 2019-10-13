package com.java.bridgelab.oops.addressmodel;

import java.io.FileNotFoundException;

public interface Address {
void add() throws FileNotFoundException;
void update() throws FileNotFoundException;
void delete() throws FileNotFoundException;
void search() throws FileNotFoundException;
}
