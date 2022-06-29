package ru.netology;


public class afisha {
    private AfishaElement[] items = new AfishaElement[0];
    int lastFilms = 10; //значение по умолчанию

    public afisha(){

    }

    public afisha(int lastFilms){
        this.lastFilms = lastFilms;
    }
    public void add(AfishaElement item) {
        int length = items.length + 1;
        AfishaElement[] tmp = new AfishaElement[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public AfishaElement[] findAll() {
        return items;
    }

    public AfishaElement[] findLast() {
        int resultLength;
        AfishaElement[] items = findAll();
        if (lastFilms > items.length) {
            resultLength = items.length;
        } else {
            resultLength = lastFilms;
        }
        AfishaElement[] result = new AfishaElement[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}