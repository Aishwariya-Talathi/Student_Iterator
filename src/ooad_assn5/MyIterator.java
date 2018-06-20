/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_assn5;

/**
 *
 * @author aishwariyatalathi
 */
public interface MyIterator {

    public void SetCurrent();

    public void Increment();

    public StudentData GetCurrentObject();

    public boolean end();
}
