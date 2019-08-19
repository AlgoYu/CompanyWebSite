package anonymous.developer.service;

import anonymous.developer.mapper.NavigationMapper;
import anonymous.developer.model.Navigation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 导航服务类
 */
@Service
public class NavigationService {
    @Autowired
    private NavigationMapper navigationMapper;

    /**
     * 通过主键ID查找导航
     * @param id 导航主键
     * @return 导航
     */
    private Navigation findNavigationByPrimaryKey(Integer id){
        return navigationMapper.selectByPrimaryKey(id);
    }

    /**
     * 得到所有的导航数据
     * @return 所有的导航数据
     */
    private List<Navigation> getAllNavigation(){
        return navigationMapper.selectAll();
    }

    /**
     * 分页查找
     * @param page 当前页面
     * @param size 当前页面项数量
     * @return 当前页导航数据
     */
    private List<Navigation> getPageNavigation(Integer page, Integer size){
        page = (page-1)*size;
        size = page + size;
        return navigationMapper.selectLimit(page,size);
    }

    /**
     * 通过主键ID修改导航
     * @param navigation 导航类
     * @return 更新是否成功
     */
    private Boolean updateNavigationByPrimaryKey(Navigation navigation){
        if(navigationMapper.updateByPrimaryKey(navigation)>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 插入导航
     * @param navigation 导航类
     * @return 插入是否成功
     */
    private Boolean insertIntoNavigation(Navigation navigation){
        if(navigationMapper.insert(navigation)>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 通过主键删除导航
     * @param id 导航主键
     * @return 删除是否成功
     */
    private Boolean deleteNavigationByPrimaryKey(Integer id){
        if(navigationMapper.deleteByPrimaryKey(id)>0){
            return true;
        }else{
            return false;
        }
    }
}