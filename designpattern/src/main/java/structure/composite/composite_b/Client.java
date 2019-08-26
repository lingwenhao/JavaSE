package structure.composite.composite_b;

/**  
 * @author ronin
 * @date 2019年3月23日  
 *    
 */
public class Client {
	public static void main(String[] args) {
		Folder f1 = new Folder("文件夹");
		imageFiles f2 = new imageFiles("头像文件");
		TextFiles f3 = new TextFiles("文本文件");
	
		/**
		 * 把头像文件和文本文件放入到文件夹中
		 */
		f1.add(f2);
		f1.add(f3);
		
		/**
		 * 图像文件杀毒
		 */
		f2.killViruls();
		
		/**
		 * 文件夹杀毒
		 */
		f1.killViruls();
	}
}
