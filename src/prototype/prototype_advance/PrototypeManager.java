package prototype.prototype_advance;


import java.util.Hashtable;

/**
 * 原型管理器 只有一个单例
 */
public class PrototypeManager {
    private Hashtable<String, OfficalDocument> ht = new Hashtable<>();
    private static final PrototypeManager instance = new PrototypeManager();

    private PrototypeManager() {
//        默认含有两个公文对象
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public static PrototypeManager getInstance() {
        return instance;
    }

    public void addOfficalDocument(String key, OfficalDocument document) {
        ht.put(key, document);
    }

    public OfficalDocument getOfficalDocument(String key) {
        return ht.get(key).clone();
    }
}
