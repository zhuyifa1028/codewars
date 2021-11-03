package y2021.m10.d29;

import java.util.List;

/**
 * 分页辅助类
 *
 * @param <I>
 * @author zhuyifa
 * @version 2021/10/28
 */
public class PaginationHelper<I> {

    // 在这个练习中，你将加强你对页面符的掌握。您将完成PaginationHelper类，这是一个实用程序类，有助于查询与数组相关的分页信息。
    // 该类被设计为接受一个值数组和一个整数，该整数指示每页允许的项目数。集合/数组中包含的值类型不相关。
    // 以下是如何使用此类的一些示例：
    //    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    //    helper.pageCount(); // should == 2
    //    helper.itemCount(); // should == 6
    //    helper.pageItemCount(0); // should == 4
    //    helper.pageItemCount(1); // last page - should == 2
    //    helper.pageItemCount(2); // should == -1 since the page is invalid
    //
    //    // pageIndex获取项目索引并返回它所属的页面
    //    helper.pageIndex(5); // should == 1 (zero based index)
    //    helper.pageIndex(2); // should == 0
    //    helper.pageIndex(20); // should == -1
    //    helper.pageIndex(-10); // should == -1

    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * 构造函数接收一个项目数组和一个整数，该整数指示一个页面中可以容纳多少个项目
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * 返回整个集合中的项目数
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * 返回页数
     */
    public int pageCount() {
        if (itemCount() % itemsPerPage == 0) {
            return itemCount() / itemsPerPage;
        } else {
            return itemCount() / itemsPerPage + 1;
        }
    }

    /**
     * 返回当前页面上的项目数。页面索引是以零为基础的。
     * 对于超出范围的pageIndex值，此方法应返回-1
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount()) {
            return -1;
        }

        if (pageIndex == pageCount() - 1) {
            return itemCount() % itemsPerPage;
        }

        return itemsPerPage;
    }

    /**
     * 确定项目所在的页面。零基索引
     * 对于超出范围的itemIndex值，此方法应返回-1
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount()) {
            return -1;
        }

        return itemIndex / itemsPerPage;
    }
}
