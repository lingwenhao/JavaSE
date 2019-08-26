/**  
 * @author ronin
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package structure.composite.composite_b;

/**  
 * 抽象组件
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public interface Component {
	void operation();
}

/**  
 * 叶子组件
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
interface Leaf extends Component {
	@Override
	void operation();
}

/**  
 * 容器组件
 * @author ronin  
 * @date 2019年3月23日  
 */
interface Composite extends Component {
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
	
	void operation();
}
