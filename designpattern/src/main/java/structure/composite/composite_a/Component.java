/**  
 * @Title: Component.java  
 * @Package com.dragonsoft.structure.composite
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package structure.composite.composite_a;

/**  
 * @ClassName: Component  
 * @Description: TODO(抽象组件)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface Component {
	void operation();
}

/**  
 * @ClassName: Leaf  
 * @Description: TODO(叶子组件)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
interface Leaf extends Component {
	void operation();
}

/**  
 * @ClassName: Composite  
 * @Description: TODO(容器组件)  
 * @author ronin  
 * @date 2019年3月23日  
 */
interface Composite extends Component {
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
	
	void operation();
}
