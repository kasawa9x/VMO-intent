package Day4.Generics.GenericTypes;
//Dictionary<Key, Value> là một class Generics
// nó chứa một cặp khóa và giá trị (key/ value)
class Dictionary<Key, Value> {
    private Key key;
    private Value value;

    public Dictionary(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
