package create.abstractfactory.abstractfactory_d;

import create.factorymethod.factorymethod_e.ExportFileApi;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/8/2 10:28
 */
public class TxtFileOperatorFactory extends AbstractFileOperatorFactory{

    @Override
    public FileOperator createFileOperator() {
        return new TxtFileOperator();
    }
}
