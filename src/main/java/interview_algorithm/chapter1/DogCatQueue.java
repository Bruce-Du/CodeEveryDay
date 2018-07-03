package interview_algorithm.chapter1;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatQueue(){
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.catQ = new LinkedList<PetEnterQueue>();
        this.count = 0;
    }

    public void add(Pet pet){
        if(pet.getPetType().equals("Dog")){
            this.dogQ.add(new PetEnterQueue(pet, this.count ++));
        }else if(pet.getPetType().equals("Cat")){
            this.catQ.add(new PetEnterQueue(pet, this.count ++));
        }else{
            throw new RuntimeException("err, not dog or cat");
        }
    }

    public Pet pollAll(){
        if(!this.dogQ.isEmpty() && !this.catQ.isEmpty()){
            if(this.dogQ.peek().getCount() < this.catQ.peek().getCount()){
                return dogQ.poll().getPet();
            }else{
                return catQ.poll().getPet();
            }
        }else if(!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }else if(!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        }else{
            throw new RuntimeException("err, queue is empty!");
        }
    }

    public Dog pollDog(){
        if(!this.isDogEmpty()){
            return (Dog) this.dogQ.poll().getPet();
        }else{
            throw new RuntimeException("Dog queue is empty!");
        }
    }

    public Cat pollCat(){
        if(!this.isCatEmpty()){
            return (Cat) this.catQ.poll().getPet();
        }else{
            throw new RuntimeException("Cat queue is empty!");
        }
    }

    public boolean isEmpty() {
        return dogQ.isEmpty() && catQ.isEmpty();
    }

    public boolean isDogEmpty(){
        return this.dogQ.isEmpty();
    }

    public boolean isCatEmpty(){
        return this.catQ.isEmpty();
    }
}
