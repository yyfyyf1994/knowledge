package yyf.designpatterns.composite.comonpent;
/**
 * 
 * @author Yu Yufeng
 * <p>组合模式，将对象组合成树形结构以表示“部分-整体”的层次结构</p>
 * <p>组合模式使得用户对单个对象和组合对象的使用具有一致性。</p>
 * <p>涉及角色：
	1.Component 是组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理Component子部件。
	2.Leaf 在组合中表示叶子结点对象，叶子结点没有子结点。
	3.Composite 定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关操作，如增加(add)和删除(remove)等。
   </p>
 */
public interface AbstractFile {   
	void add(AbstractFile f);

	void remove(AbstractFile f);

	void display(int depth);
}
